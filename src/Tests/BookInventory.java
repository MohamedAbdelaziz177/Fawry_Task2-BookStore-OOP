package Tests;

import Contracts.IEmailable;
import Contracts.ISaleable;
import Contracts.IShippable;
import Core.Book;
import Core.EBook;
import Core.PaperBook;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {

    public static List<EBook> Ebooks = new ArrayList<>();
    public static List<PaperBook> PaperBooks = new ArrayList<>();

    public static List<Book> books = new ArrayList<>();

    public static void AddBook(Book book)
    {
        if(book instanceof PaperBook)
            books.add((PaperBook) book);

        else if(book instanceof EBook)
            books.add((EBook) book);

    }


    public static void RemovePaperBook(String ISBN)
    {
        for (IShippable pBook : PaperBooks) {
            if (pBook.getISBN().equals(ISBN)) {
                PaperBooks.remove(pBook);
                break;
            }
        }
    }


    public static void GetAllBooks()
    {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public static void RemoveBook(String ISBN)
    {
        for (Book book : books)
        {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                break;
            }
        }
    }

    public static Book GetBookByTitle(String title) throws IllegalArgumentException
    {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {

                if(book instanceof PaperBook)
                return (PaperBook)book;

                else
                    return (EBook)book;
            }
        }

        throw new IllegalArgumentException("Ebook with title " + title + " not found.");
    }



}
