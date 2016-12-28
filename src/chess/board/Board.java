package chess.board;

/**
 * Created by steve on 12/26/16.
 */
public class Board
{
    private BoardLoc[][] grid = new BoardLoc[8][8];
    public class BoardLoc
    {
        private int XPos;
        private int YPos;

        public BoardLoc(int XPos, int YPos)
        {
            this.XPos = XPos;
            this.YPos = YPos;
        }

        public int getXPos() {
            return XPos;
        }

        public void setXPos(int XPos) {
            this.XPos = XPos;
        }

        public int getYPos() {
            return YPos;
        }

        public void setYPos(int YPos) {
            this.YPos = YPos;
        }


    }

    public Board() {

        BoardGUI bg = new BoardGUI();
    }

    public static void main(String[] args)
    {
        BoardGUI bg = new BoardGUI();
    }

}
