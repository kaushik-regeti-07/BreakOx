# Breakout Ball Game
## Overview

Breakout Ball Game is a classic arcade game developed using Java. The objective of the game is to break all the bricks on the screen by bouncing a ball off a paddle, which the player controls. The game ends when the player misses the ball and it touches the bottom of the screen.

## Features

- **Dynamic Gameplay**: The game allows the player to control the paddle using the keyboard to keep the ball in play.
- **Score Display**: The game keeps track of the player's score, with each brick broken adding points.
- **Game Over Screen**: When the game ends, a "Game Over" message is displayed in large letters along with the final score.
- **Customizable Frame Size**: The game can take user input for the frame size and the number of bricks.

## Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/yourusername/BreakoutBallGame.git
    cd BreakoutBallGame
    ```

2. **Set Up the Development Environment**:
    - Ensure you have Java 8 or higher installed on your machine.
    - You can use any IDE, such as IntelliJ IDEA, Eclipse, or VS Code.

3. **Compile the Code**:
    ```bash
    javac -d out src/main/java/com/kaushik/breakoutgame/*.java
    ```

4. **Run the Game**:
    ```bash
    java -cp out com.kaushik.breakoutgame.Main
    ```

## How to Play

- Start the game by pressing `ENTER`.
- Use the `Left` and `Right` arrow keys to move the paddle.
- Keep the ball from hitting the bottom of the screen by bouncing it off the paddle.
- Break all the bricks to win the game.
- The game ends when the ball touches the bottom of the screen, at which point your score will be displayed along with a "Game Over" message.


## Acknowledgements

- Inspiration from classic arcade games like Breakout.
- Java AWT and Swing for providing the graphical user interface tools.


