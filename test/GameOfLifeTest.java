
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameOfLifeTest {
  GameOfLife gameOfLife;

  @Test
  public void only_one_cell_has_no_neighbor() {
    gameOfLife = new GameOfLife(1, 1);

    gameOfLife.addCellAlive(new Cell(0, 0));

    assertThat(gameOfLife.countAliveNeighbors(new Cell(0, 0)), is(0));
  }

  @Test
  public void two_near_cells_have_one_neighbor() {
    gameOfLife = new GameOfLife(2, 2);

    gameOfLife.addCellAlive(new Cell(0, 0));
    gameOfLife.addCellAlive(new Cell(1, 1));

    assertThat(gameOfLife.countAliveNeighbors(new Cell(1, 0)), is(2));
  }

  @Test
  public void cell_surrounded_by_alives_has_eight_neighbors() {
    gameOfLife = new GameOfLife(3, 3);

    gameOfLife.addCellAlive(new Cell(0, 0));
    gameOfLife.addCellAlive(new Cell(0, 1));
    gameOfLife.addCellAlive(new Cell(0, 2));
    gameOfLife.addCellAlive(new Cell(1, 0));
    gameOfLife.addCellAlive(new Cell(1, 2));
    gameOfLife.addCellAlive(new Cell(2, 0));
    gameOfLife.addCellAlive(new Cell(2, 1));
    gameOfLife.addCellAlive(new Cell(2, 2));

    assertThat(gameOfLife.countAliveNeighbors(new Cell(1, 1)), is(8));
  }

  @Test
  public void only_one_cell_die() {
    gameOfLife = new GameOfLife(1, 1);

    gameOfLife.addCellAlive(new Cell(0, 0));

    GameOfLife nextGeneration = gameOfLife.genNextGeneration();

    assertThat(nextGeneration.cellsAlive.size(), is(0));
  }

  @Test
  public void two_near_cells_will_die() {
    gameOfLife = new GameOfLife(2, 2);

    gameOfLife.addCellAlive(new Cell(0, 0));
    gameOfLife.addCellAlive(new Cell(1, 1));

    GameOfLife nextGeneration = gameOfLife.genNextGeneration();

    assertThat(nextGeneration.cellsAlive.size(), is(0));
  }

  @Test
  public void test_three_three_grid_all_alive() {
    gameOfLife = new GameOfLife(3, 3);

    gameOfLife.addCellAlive(new Cell(0, 0));
    gameOfLife.addCellAlive(new Cell(0, 1));
    gameOfLife.addCellAlive(new Cell(0, 2));
    gameOfLife.addCellAlive(new Cell(1, 0));
    gameOfLife.addCellAlive(new Cell(1, 1));
    gameOfLife.addCellAlive(new Cell(1, 2));
    gameOfLife.addCellAlive(new Cell(2, 0));
    gameOfLife.addCellAlive(new Cell(2, 1));
    gameOfLife.addCellAlive(new Cell(2, 2));


    GameOfLife nextGeneration = gameOfLife.genNextGeneration();

    assertThat(nextGeneration.cellsAlive.size(), is(4));
  }

  @Test
  public void dead_turns_alive_when_exactly_three_neighbors() {
    gameOfLife = new GameOfLife(3, 3);

    gameOfLife.addCellAlive(new Cell(0, 1));
    gameOfLife.addCellAlive(new Cell(1, 0));
    gameOfLife.addCellAlive(new Cell(1, 1));

    GameOfLife nextGeneration = gameOfLife.genNextGeneration();

    assertThat(nextGeneration.cellsAlive.size(), is(4));
  }

  @Test
  public void test_get_dead_neighbors() {
    gameOfLife = new GameOfLife(2, 2);

    gameOfLife.addCellAlive(new Cell(0, 1));
    gameOfLife.addCellAlive(new Cell(1, 0));
    gameOfLife.addCellAlive(new Cell(1, 1));

    assertThat(gameOfLife.getDeadNeighbors(new Cell(0, 0)).size(), is(0));
  }
}