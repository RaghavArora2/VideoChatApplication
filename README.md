# Video Call Application

## Overview

This project is a video call application built with **Spring Boot** for the backend and **HTML, CSS, and JavaScript** for the frontend. The application utilizes **ZegoCloud** tools for video call functionality, providing a robust solution for online meetings.

## Features

- **Real-Time Video Conferencing**: Powered by ZegoCloud's video SDK, enabling smooth and reliable video calls.
- **Dynamic Room Creation**: Users can create and join rooms dynamically using unique room IDs.
- **User Interface**: A clean and dark-themed UI consistent with modern design aesthetics.
- **Social Media Integration**: Social media links included for easy access to developer profiles.

## Technologies Used

- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Video Call SDK**: ZegoCloud

## Getting Started

To run this project locally, follow these steps:

1. **Clone the Repository**

   ```bash
   git clone https://github.com/YourUsername/your-repo-name.git
   cd your-repo-name
   ```

2. **Set Up Backend**

   - Navigate to the backend directory.
   - Build and run the Spring Boot application.
   
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Configuration**

   - Update `appID` and `serverSecret` in the `videocall.html` file with your ZegoCloud credentials.

   ```javascript
   const appID = YOUR_APP_ID;
   const serverSecret = "YOUR_SERVER_SECRET";
   ```

4. **Accessing the Application**

   - Open localhost:8080 to register then login.

## Social Media

Connect with the developer on social media:

- [Instagram](https://www.instagram.com/mrraghavarora/)
- [LinkedIn](https://www.linkedin.com/in/raghav-arora2003/)
- [GitHub](https://github.com/RaghavArora2)

## Contributing

Contributions are welcome! Please submit a pull request or open an issue if you have suggestions or improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
## Acknowledgements

- **ZegoCloud** for providing the video call SDK.
- **Spring Boot** for simplifying backend development.
- **Font Awesome** for providing icons.
