package chess.board;

import javax.swing.*;

/**
 * Created by steve on 12/28/16.
 */
public class BoardSpaceButton extends JButton{

    private final int xPos;
    private final int yPos;

    public BoardSpaceButton(int xPos, int yPos)
    {
        super();
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public String getActionCommand()
    {
        return "" + xPos + "," + yPos;
    }


}
