# MouseDemo

This repository contains a simple Java Swing application that demonstrates mouse event handling.

## Functionality

The `MouseDemo` application displays a window with a label. Depending on the mouse actions performed within the window, the text of the label changes to indicate the corresponding mouse action. The supported mouse actions are:

- Mouse Pressed
- Mouse Clicked
- Mouse Released
- Mouse Entered (Mouse is inside the window)
- Mouse Exited (Mouse is outside the window)

## How to Use

1. Run the `MouseDemo.java` file.
2. A window titled "Mouse Demonstration!" will appear.
3. Interact with the window using your mouse:
   - Click inside the window to see "Mouse Clicked!" displayed.
   - Press and hold the mouse button to see "Mouse Pressed!" displayed.
   - Release the mouse button after pressing it to see "Mouse Released!" displayed.
   - Move the mouse cursor inside the window to see "Mouse is here!" displayed.
   - Move the mouse cursor outside the window to see "Mouse is Gone!" displayed.

## Code Structure

- **MouseDemo.java**: Contains the code for the application.
  - Defines the `MouseDemo` class.
  - Implements the `MouseListener` interface to handle mouse events.
  - Initializes a window (`JFrame`) and a label (`JLabel`) to display mouse event messages.
  - Implements methods to handle different mouse events and update the label text accordingly.
  - Includes a `main` method to create an instance of `MouseDemo` and start the application.

Enjoy exploring mouse event handling with MouseDemo!
