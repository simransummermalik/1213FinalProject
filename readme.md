The Food Inventory Tracking System was developed as a project in order for a food bank efficiently manage their inventory of perishable and non-perishable food items. The goal was to create an object-oriented system that can add, remove, and monitor food supplies, while providing alerts for expired items. This project provides a simple user interface with a console menu, allowing employees, volunteers, and donors to interact with the inventory system easily.

The objectives were to:

Practice object-oriented programming (OOP) concepts.

Apply the design recipe in developing modular and reusable code.

Model real-world behaviors of inventory management.

Handle error checking and user interaction robustly.

Design Process and Rationale At the start, the problem was broken down into two major components:

Food Items: Each food item needs to track its name, quantity, and an optional expiration date.

Inventory Management: The system needs to maintain a dynamic list of food items, allowing adding, removing, and checking for expired items.

Class Design:

A FoodItem class was created to encapsulate the properties of each item, along with behaviors like showing info and checking expiration.

An Inventory class was designed to manage a collection of FoodItem objects, implementing core methods such as addFood(), removeFood(), checkExpired(), and showInventory().

A Main class provides the console-based User Interface (UI) where users can interact with the system through a menu.

Key design considerations included:

Using ArrayList to allow dynamic, easy-to-manage inventory storage.

Using Java’s LocalDate to accurately check expiration dates.

Implementing basic input validation and exception handling for user-friendly error reporting.

Key Features and Implementation

Feature Implementation Details Food Item Tracking FoodItem class with name, quantity, and expirationDate fields. Expiration Alerts isExpired() method checks if perishable items are past their safe consumption date using LocalDate. Dynamic Inventory Management Inventory class allows adding new items, removing items by name and quantity, and listing all current inventory. User Interaction Main class provides a simple text-based menu system allowing users to interact with the inventory through numbered choices. Error Handling Added try-catch blocks to handle invalid date entries and ensured user input is validated where necessary. Testing testcase.java independently tests FoodItem creation, display, and expiration checking for known good and expired items. Challenges and Lessons Learned Throughout the development of the Food Inventory Tracking System, several challenges arose that led to key learning experiences:

Date Handling: Initially, parsing user input for expiration dates caused crashes when invalid formats were entered. Research led to using DateTimeFormatter and adding exception handling (try-catch) to gracefully manage errors.

Inventory Management Logic: Removing food items required careful iteration and matching. Improvements were made to check quantities properly and handle partial vs. complete removals logically.

User-Friendly Outputs: Output formatting was iteratively refined to make console messages clear and easy to understand, improving the overall user experience.

Testing and Validation: Creating a separate testcase.java file helped confirm that classes worked as intended, catching small issues before they became larger problems during integration.

Future Improvements While the system meets all core requirements, several potential enhancements could be made:

Adding more detailed user roles (Employee, Volunteer, Donor) with different permissions.

Supporting partial quantity removal instead of removing entire items.

Adding file saving/loading to preserve inventory data between program runs.

Building a graphical or web-based User Interface (UI) for easier and more modern user interaction.

Extending expiration checking to send proactive alerts based on customizable thresholds (e.g., items expiring within 3 days).

Final Files Submitted FoodItem.java - Class modeling a food item.

Inventory.java - Class managing the food inventory.

Main.java - Main application with console menu UI.

testcase.java - Test case file validating FoodItem behavior.

screenshottestcaseruns.png - Screenshot of test cases and program output.

ProjectReport.md (this file) - Final project report.

Conclusion This project provided valuable experience in applying object-oriented programming principles to a real-world scenario. By modeling inventory behavior and implementing user interactions, the system demonstrates a practical application of class design, modular programming, and input handling.

Through development and testing, the Food Inventory Tracking System successfully meets the requirements of a fully functional, object-oriented solution for food bank inventory management.
