# Moham's Real-time WebSocket Chat App

Welcome to **Moham's Real-time Chat**! This is a lightning-fast, real-time multiplayer chat room application built with Spring Boot and WebSockets. Users can join the room, choose a display name, and broadcast messages to everyone else connected instantly.

## 🚀 Features
- **Real-time Messaging:** Messages are broadcasted instantly using WebSockets and the STOMP protocol.
- **Join/Leave Notifications:** The chat room automatically announces when new people arrive or leave.
- **Custom avatars:** Users get a dynamically colored avatar based on their username.
- **Mobile Responsive:** Clean, modern, and customized UI that works beautifully on phones and desktops.

## 💻 Tech Stack
- **Backend:** Java 8, Spring Boot 2.5, Spring WebSockets, STOMP (Simple Text Oriented Messaging Protocol)
- **Frontend:** HTML5, Vanilla JavaScript, CSS3
- **Tools:** Maven

## 🎨 What's Customized? (The Personal Touch)
This repository was customized from a base template to include a unique aesthetic and brand:
1. **Custom Branding:** The browser tab title is updated to `"Moham's WebSocket Chat App"`, and the main chat room header is updated to `"Moham's Real-time Chat"`.
2. **Fresh Color Theme:** The standard default blue was stripped out and replaced with a vibrant **BlueViolet (`#8A2BE2`)** accent color across the app's top banner, buttons, and links.
3. **Hardened Configuration:** The `application.properties` and Java backend were modified to smoothly run on **Port 8081** to avoid usual local Tomcat port clashes.

## 🛠️ How to Run Locally

Since this project has the Maven Wrapper included, you do not need to install Maven globally. 

**1. Open a Terminal (PowerShell or Command Prompt)**
Navigate to the root folder of this project.

**2. Start the Server**
Run the following command to download dependencies, compile, and start the Spring Boot server:

```bash
# On Windows
.\mvnw clean spring-boot:run

# On Mac/Linux
./mvnw clean spring-boot:run
```

**3. Open the Application**
Once you see `Started WebsocketDemoApplication` in your terminal, open your web browser and go to:
[http://localhost:8081](http://localhost:8081)

**4. Test the Real-time Functions**
To see the real-time websocket magic, open `http://localhost:8081` in **two different browser tabs**. Join as "User A" in the first tab and "User B" in the second tab, and send messages to yourself!
