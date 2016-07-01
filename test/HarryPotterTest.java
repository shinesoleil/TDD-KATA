import org.junit.*;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HarryPotterTest {
  ArrayList<Integer> bookNumbers;

  @Before
  public void set_up() {
      bookNumbers = new ArrayList<Integer>();
  }

  @Test
  public void no_book_sold() {
    assertThat(HarryPotter.totalPrice(bookNumbers), is(0.0));
  }

  @Test
  public void only_one_type_book_sold() {
    bookNumbers.add(2);
    assertThat(HarryPotter.totalPrice(bookNumbers), is(16.0));
  }

  @Test
  public void only_two_types_books_sold() {
    bookNumbers.add(1);
    bookNumbers.add(2);
    assertThat(HarryPotter.totalPrice(bookNumbers), is(23.2));
  }

  @Test
  public void five_types_books_sold() {
    bookNumbers.add(2);
    bookNumbers.add(2);
    bookNumbers.add(2);
    bookNumbers.add(1);
    bookNumbers.add(1);
    assertThat(HarryPotter.totalPrice(bookNumbers), is(51.6));
  }
}
