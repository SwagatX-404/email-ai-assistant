# AI Email Reply Writer - Backend

This repository contains the Spring Boot backend for an AI-powered email reply generator. It uses the Gemini API to generate intelligent email replies based on input email content. The backend exposes RESTful APIs that can be consumed by the frontend testing app or the Chrome extension.

## NOTE :
## AI Email Reply Assistant  
*AI-powered smart reply generation for emails*

### Project Overview

This project is composed of **three interconnected repositories** that together form a complete AI email reply tool:

| Component              | Repository                                                                 | Description                                                                 |
|------------------------|----------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Backend**            | [https://github.com/SwagatX-404/email-ai-assistant](https://github.com/SwagatX-404/email-ai-assistant)              | Spring Boot REST API — processes email content and generates replies using **Google Gemini API** |
| **Frontend (Testing)** | [https://github.com/SwagatX-404/Ai-service](https://github.com/SwagatX-404/Ai-service)                           | React web application — allows manual testing of the backend API endpoints     |
| **Chrome Extension**   | [https://github.com/SwagatX-404/Ai-email-service-chromExt](https://github.com/SwagatX-404/Ai-email-service-chromExt) | Browser extension — injects an **“AI Reply”** button directly into Gmail / other webmail compose windows |


### Where to Start

1. **Backend** → must be running first (provides the AI generation API)  
2. **Chrome Extension** → connects to the backend (production use-case)  
3. **React Frontend** → useful during development & debugging

All three repositories contain detailed `README.md` files with setup, configuration, running instructions, and API documentation.

---


## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Introduction
The backend processes email reply requests by integrating with the Gemini AI model. It receives email content (e.g., subject, body, sender) and generates a professional reply. This service is designed to be scalable and secure, with API key management for Gemini integration.

## Prerequisites
- Java JDK 17 or higher
- Maven 3.6+
- Gemini API Key (obtain from [Google AI Studio](https://aistudio.google.com/))
- Optional: Docker for containerization
- Database (e.g., PostgreSQL or H2 for in-memory testing) – configure if persistence is needed

## Setup
1. Clone the repository: 

2. Install dependencies using Maven:

## Configuration
1. Create an `application.properties` file in `src/main/resources/` (or use `application.yml` for YAML format).
Example content:

2. Ensure the Gemini API key is securely stored (e.g., via environment variables in production).

## Running the Application
1. Run the Spring Boot application:
The server will start on `http://localhost:8080`.

2. For development with hot-reloading, use:

3. To build a JAR file:


## API Endpoints
- **POST /api/email/generate**: Generate an AI email reply.
- Request Body (JSON):
- Response:
- Headers: `Content-Type: application/json`

Use tools like Postman or curl for testing:


## Testing
- Unit tests: Run with `mvn test`.
- Integration tests: Use the React frontend testing repo or Postman to simulate requests.

## Deployment
- Deploy to cloud platforms like Heroku, AWS, or Google Cloud.
- Use Docker:
  1. Build Docker image: `docker build -t ai-email-backend .`
  2. Run: `docker run -p 8080:8080 -e GEMINI_API_KEY=<your-key> ai-email-backend`

## Contributing
Fork the repo, create a feature branch, and submit a pull request. Follow standard Java coding conventions.

## License
MIT License. See [LICENSE](LICENSE) for details.