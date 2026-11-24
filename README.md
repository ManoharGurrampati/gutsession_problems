# Java Coding & Problem Solving (GUT Sessions)

A curated collection of Java solutions for data structures, algorithms, and technical interview coding challenges organized topic-wise.

---

## 📌 Repository Overview

This repository is organized into modular sections covering foundational concepts to advanced problem-solving techniques.

- **Language:** Java 8+
- **Purpose:** Hands-on practice, interview preparation, and algorithmic mastery.

---

## 📂 Project Structure

```text
gutsession_problems/
└── Gut/
    └── src/
        ├── arrays_problems/
        │   ├── SecondLargestElement.java
        │   └── ThirdLargestElement.java
        │
        └── search_sort_algorithms/
            ├── BubbleSort.java
            ├── InsertionSort.java
            ├── MergeSort.java
            ├── SearchingProblems.java   # Linear & Binary Search
            └── SelectionSort.java
```

---

## 📚 Problem Catalog

### 1. Arrays (`arrays_problems`)
| Problem | Solution | Time Complexity | Space Complexity |
| :--- | :--- | :---: | :---: |
| Second Largest Element | [SecondLargestElement.java](Gut/src/arrays_problems/SecondLargestElement.java) |  O(N)  |  O(1)  |
| Third Largest Element | [ThirdLargestElement.java](Gut/src/arrays_problems/ThirdLargestElement.java) |  O(N)  |  O(1)  |

### 2. Searching & Sorting (`search_sort_algorithms`)
| Algorithm / Problem | Solution | Best Time | Average / Worst Time | Space |
| :--- | :--- | :---: | :---: | :---: |
| Linear Search | [SearchingProblems.java](Gut/src/search_sort_algorithms/SearchingProblems.java) | O(1) |  O(N)  |  O(1)  |
| Binary Search | [SearchingProblems.java](Gut/src/search_sort_algorithms/SearchingProblems.java) |  O(1)  |  O(\log N)  |  O(1)  |
| Bubble Sort | [BubbleSort.java](Gut/src/search_sort_algorithms/BubbleSort.java) |  O(N)  |  O(N^2)  |  O(1)  |
| Selection Sort | [SelectionSort.java](Gut/src/search_sort_algorithms/SelectionSort.java) |  O(N^2)  |  O(N^2)  |  O(1)  |
| Insertion Sort | [InsertionSort.java](Gut/src/search_sort_algorithms/InsertionSort.java) |  O(N)  |  O(N^2)  |  O(1)  |
| Merge Sort | [MergeSort.java](Gut/src/search_sort_algorithms/MergeSort.java) |  O(N \log N)  |  O(N \log N)  |  O(N)  |

---

## 🗺️ Roadmap & Upcoming Sections

- [x] **Arrays Fundamentals** (In Progress)
- [x] **Searching & Sorting** (In Progress)
- [ ] **String Manipulation**
- [ ] **Two Pointers & Sliding Window**
- [ ] **Recursion & Backtracking**
- [ ] **Linked Lists** (Singly, Doubly, Circular)
- [ ] **Stacks & Queues**
- [ ] **Binary Trees & BST**
- [ ] **Hashing & HashMaps**
- [ ] **Dynamic Programming & Greedy Algorithms**

*(Sections will be updated as topics are covered.)*

---

## 🚀 How to Run the Solutions

### Prerequisites
- Java Development Kit (JDK 8 or higher) installed.
- Git installed.

### Clone and Execute
1. **Clone the repository:**
   ```bash
   git clone https://github.com/ManoharGurrampati/gutsession_problems.git
   cd gutsession_problems
   ```

2. **Compile and run any Java file (from terminal):**
   ```bash
   # Navigate into the source directory
   cd Gut/src

   # Compile
   javac arrays_problems/SecondLargestElement.java

   # Run
   java arrays_problems.SecondLargestElement
   ```

3. **Or Open in an IDE:**
   - Open Eclipse, IntelliJ IDEA, or VS Code.
   - Open or import the `Gut` directory as a Java project.
   - Run any file using the `main` method.

---

## 📝 Problem Solving Guidelines

When contributing or adding new solutions:
1. Include a brief comment on the problem statement at the top of the file.
2. Provide at least one driver (`main`) method with sample test cases.
3. Keep track of Time ( O ) and Space ( O ) complexity in class comments or README.
