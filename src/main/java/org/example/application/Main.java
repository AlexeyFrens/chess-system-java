package org.example.application;

import org.example.chess.ChessMatch;
import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(scanner);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(scanner);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}