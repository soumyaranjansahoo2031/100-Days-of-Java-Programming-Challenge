package day4.project;

import java.util.*;

public class UserManagementDemo {
    static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Curious",true,
                new HashSet<>(Arrays.asList("ADMIN","USER"))));
        users.add(new User("Master",true,
                new HashSet<>(Arrays.asList("USER"))));
        users.add(new User("Charlie",false,
                new HashSet<>(Arrays.asList("USER"))));
        users.add(new User("Rhythmic",false,
                new HashSet<>(Arrays.asList("USER"))));

        //Remove inactive users
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().isActive()){
                iterator.remove();
            }
        }
        System.out.println("Active users--------");
        for (User user : users){
            System.out.println(user.getName());
        }
        //Count users per role
        System.out.println();
        HashMap<String,Integer> roleCount = new HashMap<>();
        for (User user : users){
            for(String role:user.getRoles()){
                roleCount.put(role,roleCount.getOrDefault(role,0)+1);
            }
        }
        System.out.println(roleCount);
    }
}
