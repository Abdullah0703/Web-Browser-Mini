# Mini Web Browser

This project is a simple mini web browser implemented in JavaFX. It allows users to browse the web, navigate between pages, refresh pages, zoom in and out, and view browsing history.

## How to Use

### Compile and Run

To run the mini web browser, compile and run the `Main.java` file, which contains the main method. This will start the application.

### Browsing

Upon launching the application, you'll see a text field where you can enter the URL of the website you want to visit. Press Enter or click the "Go" button to navigate to the specified website.

### Navigation

You can navigate between pages using the back and forward buttons. The browsing history is displayed, and you can click on any entry to revisit a previously visited page.

### Refresh

Use the refresh button to reload the current page.

### Zoom In/Out

Adjust the zoom level of the web page using the zoom in and zoom out buttons.

### Execute JavaScript

Execute custom JavaScript code by clicking the "Execute JS" button. This feature allows for advanced interactions with web pages.

## Implementation Details

The project consists of two Java files:

- **Main.java:** This file contains the main class that initializes the JavaFX application. It loads the FXML file for the user interface and sets up the stage to display the web browser.

- **Controller.java:** This file contains the controller class responsible for handling user interactions and managing the web browser functionalities. It initializes the web engine, handles page loading, navigation, refreshing, zooming, and browsing history.

## Dependencies

The project relies on JavaFX for the user interface and web browsing functionalities. It is implemented using Java programming language and requires a compatible Java Development Kit (JDK) to compile and run.

## License

This project is licensed under the [MIT License](LICENSE).
