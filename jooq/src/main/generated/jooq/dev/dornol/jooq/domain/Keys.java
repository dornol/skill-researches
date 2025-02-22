/*
 * This file is generated by jOOQ.
 */
package dev.dornol.jooq.domain;


import dev.dornol.jooq.domain.tables.Author;
import dev.dornol.jooq.domain.tables.Book;
import dev.dornol.jooq.domain.tables.records.AuthorRecord;
import dev.dornol.jooq.domain.tables.records.BookRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> AUTHOR_PKEY = Internal.createUniqueKey(Author.AUTHOR, DSL.name("author_pkey"), new TableField[] { Author.AUTHOR.ID }, true);
    public static final UniqueKey<BookRecord> BOOK_PKEY = Internal.createUniqueKey(Book.BOOK, DSL.name("book_pkey"), new TableField[] { Book.BOOK.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> BOOK__BOOK_AUTHOR_ID_FKEY = Internal.createForeignKey(Book.BOOK, DSL.name("book_author_id_fkey"), new TableField[] { Book.BOOK.AUTHOR_ID }, Keys.AUTHOR_PKEY, new TableField[] { Author.AUTHOR.ID }, true);
}
