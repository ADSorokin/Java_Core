import java.util.Random;

public class TicTacToe {
    enum CellState {
        E(0), X(1), O(2);

        private final int value;

        CellState(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        CellState[] board = new CellState[9];
        Random random = new Random();


        for (int i = 0; i < board.length; i++) {
            board[i] = CellState.E;
        }


        for (int i = 0; i < board.length; i++) {
            int index = random.nextInt(3);
            board[i] = CellState.values()[index];
        }


        System.out.println("Текущее состояние доски:");
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if (i % 3 == 2) {
                System.out.println();
            }
        }


        boolean isWin = checkWin(board);
        if (isWin) {
            System.out.println("Выигрышная комбинация!");
        } else {
            System.out.println("Игра продолжается...");
        }
    }

    private static boolean checkWin(CellState[] board) {
        // Проверка на горизонтальные линии
        for (int i = 0; i < 3; i++) {
            if (board[i] == board[i + 3] && board[i] == board[i + 6] && board[i] != CellState.E) {
                return true;
            }
        }


        for (int i = 0; i < 3; i++) {
            if (board[i] == board[i + 1] && board[i] == board[i + 2] && board[i] != CellState.E) {
                return true;
            }
        }


        if (board[0] == board[4] && board[0] == board[8] && board[0] != CellState.E) {
            return true;
        }
        if (board[2] == board[4] && board[2] == board[6] && board[2] != CellState.E) {
            return true;
        }

        return false;
    }
}