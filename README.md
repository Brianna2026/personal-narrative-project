# personal-narrative-project
# Unit 4 - Personal Narrative

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create a personal narrative using The Theater that consists of images of your personal experiences and/or interests, incorporates data related to these experiences and/or interests that can be organized in a 2D array, and uses image filters and effects to change or enhance the mood of your images.

## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:

- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use Image Filters** - Include multiple image filters learned from this unit, and additionally create new ones of your own.
- **Use methods in the String class** – Use one or more methods in the String class in your program, such as to determine whether the name of an image file contains specific characters.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML Diagram for my project](Unit5UMLDiagram.png)

## Video

Record a short video of your story to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![Thumbnail for my project](thumbnail.png)]([youtube-URL-here](https://youtu.be/swEi9f0R1QU))

## Story Description

Write a description of the story that your animation showcases. Give addional context for your story here in the case your animation is more abstract and only has images and little text. Lastly, include what data in your project is represented in 2D arrays and how those directly relate to the story your animation showcase.

The story of my project is about how I have grown up with the Sanrio characters. I have seen these ever since I was a toddler as my dad would let me watch the show and it is one of my fondest memories. This shows the breif overview of a few major characters known across the world. I first sectioned off the characters into groups by rows and used row major traversal to traverse the 2D arrays containing the character names and images. I drew scenes the showcase the different groupings and image filters to modify the images. 
## Image Filter Analysis

Choose at least 2 filters uses in your animation to explain how the pixels are modified. If you created a new image filter that was not one of the ones from this unit, make sure to explain and analyze that filter(s) before choosing ones that came from this unit.
I used the Threshold and Contrast Image Filters in my project. The Threshold image filter uses a 2D array of pixels and a nested for loop to traverse the pixels. It then modifies them by averaging the RBG settings of each pixel which determines to make the pixel black or white if the value is above or below the average. The Contrast Image Filter also uses a 2D array of pixels and a nested for loop to traverse the pixels. There are three variables one each for the RGB settings and the original RGB is multiplied by the value input by the user. This filter brightens the images pixels and creates a lightened photo.