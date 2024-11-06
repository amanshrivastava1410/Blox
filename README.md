# Blox Assignment
This repository contains solutions for Blox Assignment.

I have solved the following problems:
          **- Question 3:** Function to parse any valid JSON string into a corresponding object, list, or map.
          **- Question 5:** Banking - Simulating money transfer between two different banks.

Please find below the mandatory **Question 1:**

**a. What did the system do?**
**Answer:**  I developed a web - based Virtual Classroom platform aimed at enhancing online learning. The platform offers several key features such as class management, task assignments, material sharing, doubt resolution, and integrated video conferencing to facilitate real-time interactions between instructors and students. The backend was built using Node.js with Express.js and MongoDB, while the frontend was developed using React.js, HTML, CSS, and JavaScript, providing an interactive and responsive user experience.

**b. What other systems have you seen in the wild like that?**
**Answer:** Similar systems in the wild include Zoom for video conferencing, Google Classroom for class management and assignments, Moodle for online course creation, and Microsoft Teams for collaborative meetings and discussions. These platforms provide similar features for online learning, class management, and interaction between students and instructors.

**c. How do you approach the development problem?
Answer:** My approach to the development process began with gathering detailed requirements to understand the needs of both instructors and students. I selected the most appropriate technologies: Node.js and Express.js for backend services, and MongoDB for database management. For the frontend, I used React.js to create a dynamic and user - friendly interface. To ensure the platform’s reliability, I employed rigorous testing practices, including API testing with Postman, unit testing with Mocha and Chai, and integration testing to ensure seamless communication between the frontend and backend.

**d. What were interesting aspects where you copied code from Stack Overflow?
Answer:** Throughout the development process, I found Stack Overflow to be an invaluable resource for solving specific problems. Some of the key areas where I used Stack Overflow code snippets include:
           - Video Conferencing Integration
           - Handling Form Validation in React
           - JWT Authentication and Token Expiry Handling
These solutions helped me implement complex features efficiently, saving time and avoiding potential errors.

**e. What did you learn from some very specific copy-paste? Mention explicitly some of them.**
**Answer:** The specific code I copied from Stack Overflow was instrumental in enhancing my understanding of core concepts and refining the functionality of the platform. 
             Some of the key takeaways include:
               **- MongoDB Atlas Configuration:** I learned how to securely configure MongoDB Atlas using environment variables for sensitive information like database URI and credentials. This approach not only ensured a secure connection but also taught me how to manage cloud database connections efficiently.
               **- JWT Authentication:** Through the code snippets I copied, I gained a deep understanding of how to handle secure JWT-based user authentication. I learned the importance of signing tokens with a secret key, managing token expiration, and verifying tokens during each request to ensure user safety.
              **- Multer for File Uploads:** Using Multer for file uploads taught me how to handle large file submissions efficiently and handle edge cases like file size limits and improper formats. I also understood the significance of validating files before processing them.
               **- Real-time Video Streaming:** Integrating video conferencing into the platform was a complex task. The solutions I found helped me understand how to manage third-party API calls, handle errors during live video sessions, and optimize the user experience for both instructors and students.

**Question 3:** Function to parse any valid JSON string into a corresponding object, list, or map.
Answer: Java code provides a utility class JsonParserUtility that can parse a valid JSON string into corresponding Java objects such as Map, List, or BigDecimal. The code ensures that integers and floating - point numbers have arbitrary precision using BigDecimal.

**Question 5:** Banking - Simulating money transfer between two different banks.

1. What are the issues in such a system?
Answer: In a distributed banking system where money is transferred between different banks, there are various challenges: 
                         **- Network Latency anConnectivity Issues:** The communication between the banks may suffer due to network failures, slow connections or server breakdowns which can delay transactions.
                         **- Atomicity:** Ensuring that the transfer is atomic is a crucial challenge. If only one operation succeeds, it would lead to inconsistencies and errors in the system.
                         **- Data Integrity:** Ensuring that the money is correctly transferred without being lost or duplicated is critical. Any inconsistencies in the data would cause financial errors.
                         **- Security:** Transferring money between accounts on different systems involves the risk of unauthorized access, hacking, and data breaches. Sensitive information like bank account details, passwords, and transaction amounts need to be encrypted to protect the privacy and security of users.

2. What can we do to mitigate some of the issues?
Answer: To mitigate these issues, there are multiple strategies we can follow like Transaction Logs and Recovery Mechanism, Distributed Locking Mechanisms, Two-Phase Commits, Redundancy and Fault Tolerance and Encryption and Authentication. 

## Installation Instructions
### Clone the repository
```bash
git clone https://github.com/amanshrivastava1410/BloxAssignment.git
