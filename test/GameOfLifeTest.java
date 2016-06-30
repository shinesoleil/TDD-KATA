
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameOfLifeTest {
  GameOfLife gameOfLife;

  @Test
  public void only_one_cell_has_no_neighbor() {
    gameOfLife = new GameOfLife();

    gameOfLife.addCell(new Cell(0, 0));

    assertThat(gameOfLife.countAliveNeighbors(new Cell(0, 0)), is(0));
  }

  @Test
  public void two_near_cells_have_one_neighbor() {
    gameOfLife = new GameOfLife();

    gameOfLife.addCell(new Cell(0, 0));
    gameOfLife.addCell(new Cell(1, 1));

    assertThat(gameOfLife.countAliveNeighbors(new Cell(1, 0)), is(2));
  }

  @Test
  public void cell_surrounded_by_alives_has_eight_neighbors() {
    gameOfLife = new GameOfLife();

    gameOfLife.addCell(new Cell(0, 0));
    gameOfLife.addCell(new Cell(0, 1));
    gameOfLife.addCell(new Cell(0, 2));
    gameOfLife.addCell(new Cell(1, 0));
    gameOfLife.addCell(new Cell(1, 2));
    gameOfLife.addCell(new Cell(2, 0));
    gameOfLife.addCell(new Cell(2, 1));
    gameOfLife.addCell(new Cell(2, 2));

    assertThat(gameOfLife.countAliveNeighbors(new Cell(1, 1)), is(8));
  }


}