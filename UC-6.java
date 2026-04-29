

#include <iostream>
using namespace std;

// Function to display board
void displayBoard(char board[3][3])
{
    cout << "\nCurrent Board:\n";
    
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << board[i][j];

            if (j < 2)
                cout << " | ";
        }

        cout << endl;

        if (i < 2)
            cout << "--|---|--\n";
    }
}

// Function to place move
void placeMove(char board[3][3], int row, int col, char symbol)
{
    board[row][col] = symbol;
}

int main()
{
    char board[3][3] =
    {
        {'X', ' ', 'O'},
        {' ', 'X', ' '},
        {'O', ' ', ' '}
    };

    int row, col;
    char symbol;

    displayBoard(board);

    cout << "\nEnter row (0-2): ";
    cin >> row;

    cout << "Enter column (0-2): ";
    cin >> col;

    cout << "Enter symbol (X/O): ";
    cin >> symbol;

    // Place move on board
    placeMove(board, row, col, symbol);

    cout << "\nBoard Updated Successfully!\n";

    displayBoard(board);

    return 0;
}
