# Status Saver for Whatsapp
This is a Kotlin based mobile application which can be used to save the images and videos from Whatsapp Statuses. Natively, Whatsapp doesn't have a way through which status can be downloaded and saved online. This app helps us do the same.

## UI
<img src="https://github.com/user-attachments/assets/5d60df16-2622-428e-8616-2abd5774dd08" width=300 height=600>
<img src="https://github.com/user-attachments/assets/8a70ddda-14e5-4660-85ba-d4077f958611" width=300 height=600>
<img src="https://github.com/user-attachments/assets/47c0f010-9ee0-42ed-b53c-968acfcbc6c0" width=300 height=600>
<img src="https://github.com/user-attachments/assets/28904b38-593a-48d0-93ea-58420b8a6e84" width=300 height=600>
<img src="https://github.com/user-attachments/assets/bdc75e06-c1e6-4359-9afd-c09dce77e54b" width=300 height=600>
<img src="https://github.com/user-attachments/assets/3e19eb38-e360-44d4-9817-d6f10503cc9f" width=300 height=600>

## Features
* Has a home page and a settings page.
* Uses the .Statuses hidden folder from Whatsapp Media to obtain the statuses.
* Shows the permissions page at the first installation of the app which on click directs to the .Status folder allowing seamless permission.
* Has the ability to recognize the android version and check the path for status accordingly (The paths were different prior to Android 11.)
* Has separate tabs for photos and videos.
* The videos player uses exoplayer to preview the video and download it.
* For images, zoomage is used, instead of simple image viewer, so that images can be zoomed in and out.
* Images/videos can be downloaded directly from the home page or from the preview.
* Has both light mode and dark mode themes.
* Usage guide in the settings page.

## Scope
* A separate page for Whatsapp Business statuses. The backend and frontend for this is already written. Integration is pending.
* In the settings page, the option to change path for downloads is not enabled yet.
* In the preview, there are buttons for sharing and reposting, but the support hasn't been added yet.





