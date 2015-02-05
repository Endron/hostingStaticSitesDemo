/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Tobias Kremer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.endron.hostingStaticSitesDemo.init;

import io.github.endron.hostingStaticSitesDemo.data.Book;
import io.github.endron.hostingStaticSitesDemo.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * CommandLineRunner to initialize the database with some Books.
 */
@Component
public class InitDatabaseRunner implements CommandLineRunner {

    @Autowired
    BookRepository repository;

    @Override
    public void run(final String... args) throws Exception {
        repository.save(createBook("The Lord of the Rings", "J. R. R. Tolkien"));
        repository.save(createBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
        repository.save(createBook("Das Kapital", "Karl Marx"));
    }

    private Book createBook(final String title, final String author) {
        final Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);

        return book;
    }
}
