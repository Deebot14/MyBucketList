# MyBucketList
This app was a personal project to test Android features and practice UI development with modern Android components.

## Programming Language
Java


## App Overview
The app uses RecyclerView to display a scrollable list of custom entries, each represented by a card containing:

- A title
- A short description
- An image
- A rating bar


## Core Features
- ###Two Bucket List Categories
Users can select between "Things to Do" and "Places to Go" from the home screen (MainActivity). Each option opens a new screen displaying relevant items.

- ### CardView-based List UI
Items are shown using a RecyclerView with individual cards (CardView) that visually and clearly present each bucket list entry.

- ### Data Structuring with Models
Each list entry is represented using a BucketListEntry model that holds the content needed for display: heading, description, image, and rating.

- ### Clean Adapter Implementation
A RecyclerView.Adapter (BucketListEntryAdapter) binds the data to views efficiently using the ViewHolder pattern for better performance and structure.
