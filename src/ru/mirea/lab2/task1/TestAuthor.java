package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("misha", "abcd",  'm');
        System.out.println(author.toString());

        author.getEmail();

        author.setEmail("asdfg");

        System.out.println(author.toString());
    }
}