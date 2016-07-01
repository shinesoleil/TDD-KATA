import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GameOfLife {
  public int row;
  public int column;
  public ArrayList<Cell> cellsAlive;

  public GameOfLife(int row, int column) {
    this.row = row;
    this.column = column;
    this.cellsAlive = new ArrayList<>();
  }

  public void addCellAlive(Cell cell) {
    cellsAlive.add(cell);
  }

  public int countAliveNeighbors(Cell cell) {
    return getAliveNeighbors(cell).size();
  }

  public Set<Cell> getDeadNeighbors(Cell cell) {
    Set<Cell> neighbors = new HashSet<>();

    for (int i = -1; i <= 1 ; i++) {
      for (int j = -1; j <= 1; j++) {
        if (cell.x + i >= 0 && cell.y + j >= 0
          && cell.x + i <= row - 1 && cell.y + j <= column - 1
          && !(cell.x + i == cell.x && cell.y + j == cell.y)
          && !cellsAlive.contains(new Cell(cell.x + i, cell.y + j))) {
          neighbors.add(new Cell(cell.x + i, cell.y + j));
        }
      }
    }

    return neighbors;
  }

  private Set<Cell> getAliveNeighbors(Cell cell) {
    Set<Cell> aliveNeighbors = new HashSet<>();

    for (Cell cellAlive: cellsAlive) {
      if (Math.abs(cellAlive.x - cell.x) <= 1
        && Math.abs(cellAlive.y - cell.y) <= 1
        && !cellAlive.equals(cell)) {
        aliveNeighbors.add(cellAlive);
      }
    }
    return aliveNeighbors;
  }


  public GameOfLife genNextGeneration() {
    GameOfLife nextGeneration = new GameOfLife(row, column);

    Set<Cell> deadCellsAround = new HashSet<>();

    for (Cell cellAlive: cellsAlive) {
      if (countAliveNeighbors(cellAlive) == 2 ||
        countAliveNeighbors(cellAlive) == 3) {
        nextGeneration.addCellAlive(cellAlive);
      }
      deadCellsAround.addAll(getDeadNeighbors(cellAlive));
    }

    for (Cell cellDead: deadCellsAround) {
      if (countAliveNeighbors(cellDead) == 3) {
        nextGeneration.addCellAlive(cellDead);
      }
    }

    return nextGeneration;
  }
}

class Cell {
  public int x;
  public int y;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (!(obj instanceof Cell)) return false;
    Cell cell = (Cell) obj;
    return cell.x == this.x && cell.y == this.y;
  }

  @Override
  public int hashCode() {
    return Integer.valueOf(this.x + "" + this.y);
  }


}