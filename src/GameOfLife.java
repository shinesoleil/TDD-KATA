import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GameOfLife {
  public int row;
  public int column;
  public ArrayList<Cell> cellsAlive;

  public GameOfLife() {
    this.cellsAlive = new ArrayList<Cell>();
  }

  public void addCell(Cell cell) {
    cellsAlive.add(cell);
  }

  public int countAliveNeighbors(Cell cell) {
    return getAliveNeighbors(cell).size();
  }

  private Set<Cell> getAliveNeighbors(Cell cell) {
    Set<Cell> aliveNeighbors = new HashSet<Cell>();

    for (Cell cellAlive: cellsAlive) {
      if (Math.abs(cellAlive.x - cell.x) <= 1
        && Math.abs(cellAlive.y - cell.y) <= 1
        && !cellAlive.equals(cell)) {
        aliveNeighbors.add(cellAlive);
      }
    }
    return aliveNeighbors;
  }
}

class Cell {
  public int x;
  public int y;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean equals(Cell cell) {
    return this.x == cell.x && this.y == cell.y;
  }
}