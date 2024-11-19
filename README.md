# The Mars Rover

The surface of Mars is represented by a Plateau.
The Plateau is a square/rectangular grid with proportions chosen by the User.
Rovers navigate the Plateau by following a sequence of commands. 

## The Plateau

The Plateau is divided into a grid.

## The Rover position

A Rover's position is represented by x and y co-ordinates and the letters N, S, W, E to represent North, South, West, East (the four cardinal compass points) respectively.

```
Example
0 0 N
```

This means the Rover is at the bottom-left corner facing in the North direction.

> Assume that the square directly North from `(x, y)` is `(x, y + 1)`, and the square directly East from `(x, y)` is `(x + 1, y)`

## Program Inputs

### First Line: Plateau Creation

The first line inputted into the program represents the upper-right coordinates of the Plateau.

Example:

```
5 5
```

This Plateau has maximum (x, y) co-ordinates of (5, 5), and is therefore a Plateau of size (6,6).

> Assume that the lower-left coordinate is (0, 0).

### Subsequent lines: Rover Creation & Instructions

Following the plateau creation, each Rover receives two lines of input. The first line of input is to land the Rover at a particular starting position, e.g.

```
1 2 N
```

This lands the Rover at position (1,2) facing North.

The following line of input is a string of letters representing instructions to move the Rover around the Plateau.

## Instructions

To move a Rover around the Plateau, a string of letters is sent to a Rover.

| Letter | Action                                                                              |
| ------ | ----------------------------------------------------------------------------------- |
| L      | Spins the Rover 90 degrees Left without moving from the current coordinate point    |
| R      | Spins the Rover 90 degrees Right without moving from the current coordinate point   |
| M      | Moves the Rover forward by one grid point, maintaining the same heading/orientation |

