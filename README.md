# TodoList
# To-Do List Application in Java

## Overview
This is a simple **To-Do List Application** implemented in Java, allowing users to manage tasks efficiently. The program lets you add tasks, update their status, and categorize them as **Live** or **Completed** for better organization. 

## Features
1. **Add Task**: Add a new task with a title and status (`Live` or `Completed`).
2. **Update Task**: Update the status of an existing task.
3. **Display Live Tasks**: View all tasks marked as "Live".
4. **Display Completed Tasks**: View all tasks marked as "Completed".
5. **Exit**: Exit the application.

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/todo-list-java.git
   ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse) or use a terminal.
3. Compile and run the `todolist.java` file:
   ```bash
   javac todolist.java
   java todolist
   ```
4. Use the menu options to manage your tasks:
   - Enter `1` to add a new task.
   - Enter `2` to update the status of a task.
   - Enter `3` to view all "Live" tasks.
   - Enter `4` to view all "Completed" tasks.
   - Enter `5` to exit the application.

## Code Structure
- **Task Class**: Represents an individual task with attributes `title` and `status`. Provides methods for retrieving and updating task information.
- **todolist Class**: Implements the main logic of the application, including task management and interaction with the user through a menu.

## Example
### Adding a Task
```
Enter task title: Grocery shopping
Enter task status (Live/Completed): Live
Task added successfully.
```

### Updating a Task
```
Enter task title to update: Grocery shopping
Enter new status (Live/Completed): Completed
Task updated successfully.
```

### Displaying Tasks
**Live Tasks**:
```
Live Tasks:
- Grocery shopping
```

**Completed Tasks**:
```
Completed Tasks:
- Grocery shopping
```


