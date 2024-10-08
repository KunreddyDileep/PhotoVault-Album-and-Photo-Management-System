# PhotoVault-Album-and-Photo-Management-System
PhotoVault: Album and Photo Management System Spring Boot RestFul API 

This API documentation outlines several endpoints for managing albums, photos, and authentication-related tasks.

**Album Management:**

PUT /api/v1/albums/{album_id}/update: Updates an album's name and description.
PUT /api/v1/albums/{album_id}/photos/{photo_id}/update: Updates a photo's name and description within an album.
POST /api/v1/albums/{album_id}/upload-photos: Uploads one or more photos to an album.
POST /api/v1/albums/add: Adds a new album.
GET /api/v1/albums: Lists all albums.
GET /api/v1/albums/{album_id}: Retrieves a specific album by its ID.
GET /api/v1/albums/{album_id}/photos/{photo_id}/download-thumbnail: Downloads the thumbnail of a photo.
GET /api/v1/albums/{album_id}/photos/{photo_id}/download-photo: Downloads a full-size photo.
DELETE /api/v1/albums/{album_id}/photos/{photo_id}/delete: Deletes a photo from an album.
DELETE /api/v1/albums/{album_id}/delete: Deletes an album.

**Authentication and User Management:**

PUT /api/v1/auth/users/{user_id}/update-authorities: Updates a user’s authorities.
PUT /api/v1/auth/profile/update-password: Updates the user’s profile password.
POST /api/v1/auth/users/add: Adds a new user.
POST /api/v1/auth/token: Authenticates a user by email and password, returning a token.
GET /api/v1/auth/users: Lists all users.
GET /api/v1/auth/profile: Retrieves the current user's profile.
DELETE /api/v1/auth/profile/delete: Deletes the current user's profile.

**Project Setup and API Execution**

**Prerequisites**

Ensure that you have the necessary environment setup (Java, Maven, etc.) to run the project locally.
Make sure the application is running on http://127.0.0.1:8080.

**Steps to Access and Execute APIs**

**1. Start the Application**

* Clone the repository and navigate to the project directory.
* Run the application:
**bash**
*mvn spring-boot:run

**Open your browser and navigate to:**
*http://127.0.0.1:8080/swagger-ui/index.html

**2. Generate an Access Token**

* Locate the authentication API in the Swagger UI (usually under a section like Auth or Authentication).
* Use the authentication API (/auth/token or similar) to generate an access token by providing the required credentials (e.g., username and password).
* Copy the generated token from the response.

**3. Authorize API Requests**

* In the Swagger UI, click on the Authorize button (usually located at the top right).
* Paste the token into the authorization dialog box, typically under Bearer Token.
* Click **Authorize**.

**4. Access and Execute Other API Methods**

* Now, you can access the other secured API methods listed in the Swagger UI.
* Select the desired API, fill in any required parameters, and execute the request.
* Review the API response in the Swagger UI.

**5. Deauthorize When Done**

* Once you've finished, click the **Authorize** button again and choose **Logout** to clear the token.

**Note:**
Ensure your token is valid before making API requests. If the token expires, you'll need to regenerate it by following step 2.

