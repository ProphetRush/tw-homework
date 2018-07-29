# Maze Generator Documentation

## How to run application

### Run with custom input
Just import into IDEA and run Main class.

### Run unit tests
Import into IDEA and go to the test root, right click in the button near class defination and click run all tests.

## Project Structure Overview
This project is divided into four levels, **application level, handler level, model level and util level**. For application layer, 
it is a general entrance to this project, and it just simply call the general entrance in handler level called **MazeGenerateHandler**.

### Model Level
For model level, I defined two model **MazeNode** and **MazeInfo**. **MazeNode** is a abstraction to the position of every cell, 
it contains two field **row** and **column**. 
**MazeInfo** represents the main defination of a maze, including **rows**, **columns**, **pathNodePair**. **PathNodePairs** 
uses a `HashMap<MazeNode, MazeNode>` to saves the two connected nodes as key and values. 

### Util Level
In util level, I defined five different Exceptions in this project, it is the generic `MazeGenerateException`, 
`CommandFormatException extends MazeGenerateException`, `MazeFormatException extends MazeGenerateException`, `NumberFormatException extends CommandFormatException`
and `NumberOutOfRangeException extends CommandFormatException`.
I also do a encapsulation of Strings to enhance the code readability.

### Handler Level
The main flow of this project is in handler level.
In this project, the render of a maze contains four parts, **read input as a command, validate command, convert command into a maze, render the maze.**
So the main code could be like:
`````````
        MazeInfo mazeInfo = parser.parseInputCommand(input.getInputStringLine());
        MazeFactory mazeFactory = new MazeFactory();
        return mazeFactory.createMaze(mazeInfo);
`````````
#### Maze
A maze should contains two basic operations, `render()` and `solve()`, inside the maze, every maze should contain the information about rows and columns and connected pairs.
Also, to represent a maze, a two-dimensional array is introduced, **0 represents the wall, 1 represents the roads or cells**.

#### Work Principle
When user inputs a command, the handler will first parse this command into a `List<String>` that length is 2 
(if in the future we need to generate multiple mazes an even number is also accepted, just simply modify the `acceptedLines`).
Then `CommandParser` will parse the String list into a MazeInfo. Finally, in `MazeFactory` it will create a Maze entity containing the 
representation matrix, to render the matrix we just simply use [W] instead of 0 and [R] instead of 1.

##Test Case
`"3 3\n0,1 0,2;0,0 1,0;0,1 1,1;0,2 1,2;1,0 1,1;1,1 1,2;1,1 2,1;1,2 2,2;2,0 2,1"`,
`"1 2\n0,0 0,1",
`"3,3\n "`,
`"0 1\n "`,
`"3 a\n "`,
`"3 3\n "`,
`"3 3\n0,0 0,0"`,
`"3 3\n0,0 1,1"`

## GOOD NIGHT
