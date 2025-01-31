# Product Management API

## Overview
This is a Spring Boot-based Product Management API that allows users to:
- Retrieve all products
- Add a new product

The application uses **PostgreSQL** for data persistence and is containerized using **Docker**. It is deployed and orchestrated using **Minikube**.

## Tech Stack
- **Spring Boot** - Backend framework for building RESTful APIs.
- **PostgreSQL** - Database for storing product data.
- **Docker** - Containerization for easy deployment.
- **Docker Compose** - Manages multi-container setups (Spring Boot + PostgreSQL).
- **Minikube** - Local Kubernetes cluster for testing and deployment.

---

## 🛠️ Setup Instructions

### Prerequisites
Ensure you have the following installed:
- [JDK 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/get-started)
- [Minikube](https://minikube.sigs.k8s.io/docs/)

---

## 🚀 Running the Application

### 1️⃣ Run Locally (Without Docker)
```sh
# Clone the repository
git clone https://github.com/your-username/product-management-api.git
cd product-management-api

# Build and run the application
mvn spring-boot:run
```

The application will be available at: **http://localhost:8080**

---

### 2️⃣ Running with Docker
#### **Step 1: Build the Docker Image**
```sh
docker build -t product-management-api .
```
#### **Step 2: Run the Container**
```sh
docker run -p 8080:8080 product-management-api
```
#### **Step 3: Access the API**
- **Get all products:** `GET http://localhost:8080/api/products`
- **Add a product:** `POST http://localhost:8080/api/products`

---

### 3️⃣ Running with Docker Compose
```sh
docker-compose up --build
```
This starts both the **Spring Boot app** and the **PostgreSQL database** in containers.

---

### 4️⃣ Deploying with Minikube
#### **Step 1: Start Minikube**
```sh
minikube start
```
#### **Step 2: Deploy the application**
```sh
kubectl apply -f kubernetes/deployment.yml
kubectl apply -f kubernetes/service.yml
```
#### **Step 3: Get the service URL**
```sh
minikube service product-service --url
```
Access the application via the URL provided.

---

## 📜 API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/products` | Retrieve all products |
| POST | `/api/products` | Add a new product |

---

## 🔧 Future Enhancements
✅ Implement **JWT Authentication** for secured API access.  
✅ Use **Helm Charts** for simplified Kubernetes deployment.  
✅ Set up **CI/CD pipelines** for automated deployments.  
✅ Integrate **Redis caching** for improved performance.  
✅ Implement **Prometheus & Grafana** for monitoring.  

---

## 📜 License
This project is licensed under the MIT License.

---

## 🙌 Contributing
Feel free to submit pull requests and issues to improve the project!

