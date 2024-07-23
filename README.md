<!-- README.md -->

# Product Management API

This project is a Spring Boot application for managing products and their categories. It provides a set of RESTful API endpoints to perform CRUD operations on products and manage their categories. The project uses MySQL as the database and leverages Spring Data JPA for data persistence.

## Features

- **Create Product**: Add a new product to the database.
- **Update Product**: Update an existing product's details.
- **Get Single Product**: Retrieve details of a specific product by its ID.
- **Get Product By Category**: Fetch products belonging to a specific category.
- **Get All Products**: Retrieve a list of all products.
- **Get All Products (Short)**: Retrieve a list of all products with only selected fields (using projections).
- **Delete Product**: Remove a product from the database.
- **Get All Categories**: Fetch all available categories of products.

## Technologies Used

- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **JPA Query Methods**
- **Entity Relationships (Cardinality)**
  - `@ManyToOne` and other relationships
- **Projection for fetching partial data**

## Models

### BaseModel

A base class for common entity properties.

### Product

Represents a product entity with properties like ID, title, and category.

### Category

Represents a category entity with properties like ID and title. Each product is associated with a category.

### Product Projection

An interface-based projection to retrieve partial product data.

## Getting Started

### Prerequisites

- Java 19 or higher
- Maven
- MySQL


<h3>Usage</h3>

<p>To run the project locally:</p>

<ol>
  <li>Clone this repository.</li>
  <li>Configure your IDE (like IntelliJ IDEA or Eclipse) with Maven support.</li>
  <li>Update the necessary configurations (API endpoints, etc.) in the application properties or configuration files.</li>
  <li>Run the application as a Spring Boot application.</li>
</ol>

<h3>Contributions</h3>

<p>Contributions are welcome! If you have suggestions or improvements, feel free to fork the repository and submit a pull request.</p>

<h3>License</h3>

<p>This project is licensed under freeware. You are free to use, modify, and distribute the software with no additional restrictions.</p>
