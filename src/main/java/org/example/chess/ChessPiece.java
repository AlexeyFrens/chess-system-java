package org.example.chess;

import org.example.boardGame.Board;
import org.example.boardGame.Piece;
import org.example.boardGame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public void increaseMoveCount(){
        moveCount++;
    }

    public void decreaseMoveCount(){
        moveCount--;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
