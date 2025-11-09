package day6.streams.intermediate;


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Stream;

public class IntermediateDemo {
    static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Atomic Habits", "Habits", "James Clear", 747.0, 2018),
                new Book("The Power of Your Subconscious Mind", "Mindset", "Joseph Murphy", 107.0, 1963),
                new Book("Dopamine Detox", "Productivity", "Thibaut Meurisse", 129.0, 2020),
                new Book("The 7 Habits of Highly Effective People", "Personal Growth", "Stephen R. Covey", 589.0, 1989),
                new Book("How to Win Friends and Influence People", "Communication", "Dale Carnegie", 144.0, 1936),
                new Book("Think and Grow Rich", "Success", "Napoleon Hill", 198.0, 1937),
                new Book("The Subtle Art of Not Giving a F*ck", "Mental Clarity", "Mark Manson", 270.0, 2016),
                new Book("Deep Work", "Focus", "Cal Newport", 139.0, 2016),
                new Book("Can’t Hurt Me", "Resilience", "David Goggins", 145.0, 2018),
                new Book("The Four Agreements", "Wisdom", "Don Miguel Ruiz", 188.0, 1997),
                new Book("The Magic of Thinking Big", "Motivation", "David J. Schwartz", 230.0, 1959),
                new Book("Mindset", "Psychology", "Carol S. Dweck", 130.0, 2006),
                new Book("The Miracle Morning", "Morning Routine", "Hal Elrod", 163.0, 2012),
                new Book("You Are a Badass", "Confidence", "Jen Sincero", 258.0, 2013),
                new Book("The Alchemist", "Inspiration", "Paulo Coelho", 123.0, 1988),
                new Book("Awaken the Giant Within", "Empowerment", "Tony Robbins", 379.0, 1991),
                new Book("The Artist’s Way", "Creativity", "Julia Cameron", 544.0, 1992),
                new Book("Dare to Lead", "Leadership", "Brené Brown", 260.0, 2018),
                new Book("Self-Compassion", "Emotional Health", "Kristin Neff", 425.0, 2015),
                new Book("The Things You Can See Only When You Slow Down", "Mindfulness", "Haemin Sunim", 159.0, 2017)
        );
        //1. Filtering books cheaper than 250 rupees
        Stream<Book> stream1 = books.stream();
//        stream1.filter(b->b.getPrice() < 250);
        stream1.filter(p).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");


        //2. Mapping: Convert book titles to uppercase
        Stream<Book> stream2 = books.stream();
        stream2.peek(b->b.setTitle(b.getTitle().toUpperCase()))
//                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------");


        //3. Sorting: Books by publication year
        books.stream()
                .sorted(Comparator.comparingInt(b->b.getPublicationYear()))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //4. Distinct: Remove Duplicate Titles
        books.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");

        //5. Limit:  Display only the first 3 books
        books.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        //5. Limit:  Skip the first 3 books
        books.stream()
                .skip(3)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
    }
    static Predicate<Book> p = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.getPrice() < 250;
        }
    };
}
