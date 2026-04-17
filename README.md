# Document Prototype Design Pattern

## Problem Statement
A document processing system needs to support multiple document types such as PDF, Text, and Spreadsheet. Creating new document objects directly using constructors can be inefficient and tightly coupled to the specific document classes.

To address this, the system uses the **Prototype Design Pattern**, which allows new documents to be created by cloning existing prototype objects instead of instantiating new ones from scratch. A central registry stores these prototypes and provides methods to clone them when needed.

This approach improves flexibility, reduces object creation cost, and allows the system to add new document types without modifying the client code.

---

## UML Class Diagram
<img width="1233" height="622" alt="documentPrototype UML Class Diagram" src="https://github.com/user-attachments/assets/47856ccd-4d0d-4aff-909b-3d4d3d8fdd1c" />

---

## Components

### 1. Document (Interface)
Defines the common operations that all document types must implement.

**Methods**
- `clone()` – Creates and returns a copy of the document.
- `open()` – Simulates opening the document.
- `getType()` – Returns the type of the document.

---

### 2. PdfDocument (Concrete Prototype)
Represents a PDF document.

**Attributes**
- `fileName : String`
- `author : String`
- `pageCount : int`

**Responsibilities**
- Implements cloning of a PDF document.
- Displays information when the document is opened.

---

### 3. TextDocument (Concrete Prototype)
Represents a text document.

**Attributes**
- `filePath : String`
- `encoding : String`
- `wordCount : int`

**Responsibilities**
- Implements cloning of a text document.
- Displays text document details when opened.

---

### 4. SpreadsheetDocument (Concrete Prototype)
Represents a spreadsheet document.

**Attributes**
- `spreadsheetName : String`
- `rowCount : int`
- `columnCount : int`

**Responsibilities**
- Implements cloning of a spreadsheet document.
- Displays spreadsheet details when opened.

---

### 5. DocumentRegistry (Prototype Registry)
Maintains prototype instances of each document type.

**Attributes**
- `pdfPrototype : PdfDocument`
- `textDocumentPrototype : TextDocument`
- `spreadsheetPrototype : SpreadsheetDocument`

**Responsibilities**
- Initializes prototype objects in its constructor.
- Provides methods to create document copies using cloning.

---

### 6. ProcessedDocument (Client / Main Class)
Serves as the entry point of the program.

**Responsibilities**
- Creates an instance of `DocumentRegistry`.
- Requests cloned document objects from the registry.
- Calls the `open()` method to demonstrate document usage.

---
