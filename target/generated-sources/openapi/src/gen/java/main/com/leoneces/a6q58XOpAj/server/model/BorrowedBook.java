package com.leoneces.a6q58XOpAj.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leoneces.a6q58XOpAj.server.model.Book;
import com.leoneces.a6q58XOpAj.server.model.Borrower;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BorrowedBook
 */

@JsonTypeName("borrowed_book")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-27T01:20:18.409819238+01:00[Europe/Dublin]", comments = "Generator version: 7.7.0")
public class BorrowedBook {

  private Book book;

  private Borrower borrower;

  public BorrowedBook book(Book book) {
    this.book = book;
    return this;
  }

  /**
   * Get book
   * @return book
   */
  @Valid 
  @Schema(name = "Book", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Book")
  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public BorrowedBook borrower(Borrower borrower) {
    this.borrower = borrower;
    return this;
  }

  /**
   * Get borrower
   * @return borrower
   */
  @Valid 
  @Schema(name = "Borrower", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Borrower")
  public Borrower getBorrower() {
    return borrower;
  }

  public void setBorrower(Borrower borrower) {
    this.borrower = borrower;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BorrowedBook borrowedBook = (BorrowedBook) o;
    return Objects.equals(this.book, borrowedBook.book) &&
        Objects.equals(this.borrower, borrowedBook.borrower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(book, borrower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BorrowedBook {\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    borrower: ").append(toIndentedString(borrower)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

