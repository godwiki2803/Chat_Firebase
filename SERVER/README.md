# AwesomeChat Notification Server Setup Guide

This is a simple server application that allows to enable Firebase Cloud Messaging Push Notification for AwesomeChat.

# Getting Started 

Install Node js. Check the following link [here](https://nodejs.org/en/download/package-manager/) and run * node -v * from terminal.

# Add Server Key

Open the index.js File and change the following line

* databaseURL: "[YOUR_FIREBASE_DATABASE_URL]" *
* var serverKey = '[YOUR_LEGACY_SERVER_KEY]'; * 

# Setup firebase functions

Follow the instructions [here](https://firebase.google.com/docs/functions/get-started) to setup your firebase functions.<br/>
Go to [google cloud console](https://console.cloud.google.com/iam-admin/iam/iam-zero), select your project, go to service accounts, create a new service account, then create a new json key, rename the file *serviceAccountKey.json* and put it in the *functions* folder.<br/>
Run * npm install * to retrieve all the necessary dependencies.<br/>
Run * firebase use --add * .<br/>
Run * firebase deploy --only functions * .<br/>
