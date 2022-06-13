# Jakarta-Flood-Prediction
Bangkit Capstone Project 2022


As the final project of the Bangkit Academy 2022 program, our team created an application that can detect flooding at Jakarta floodgates, based on the water level against the color meter.
Currently this application combines machine learning and mobile development, in the future the cloud feature will be used to store databases and display them to the public.

# MACHINE LEARNING
If you want to use the machine learning dataset, we already provide them in the same folder.
For the machine learning model, here are some libraries that we use :
- TensorFlow
- Keras (ImageDataGenerator)
- Numpy
- Matplotlib
- OS
- Zipfile (Optional : you don't have to because the dataset we provided is not in zip form)
- Pillow

The machine learning part of this application is using 'Convolutional Neural Network (CNN)' which aims to detect and classify images. The images that are classified are the color meters found on the floodgates in Jakarta. By looking at the water level and the color meter, the application can distinguish between alert statuses 1-4 and provide warnings when residents need to evacuate.

*Since the dataset we provided are limited, a certain angle is required in order to take picture that will be processed by machine learning.

# MOBILE DEVELOPMENT
For the mobile development part, at the moment this application is only available for android. We use java as our programming language inside AndroidStudio. From the machine learning part we export our model as tflite file so it could easily be read from android studio.
All user interface were made inside figma, and some of the icons are created using Adobe Illustrator.
We use Redmi Note10 for our MD model, so there are still shortcomings in the display if you open it from the type of cell phone whose pixel size is much different.
*At this stage everyone can login without entering email or password, later this feature is only available for staff working at Jakarta FloogGate

# CLOUD
We are using Google Firebase to upload our result from the mobile app and import it to a different activities inside AndroidStudio. However, because lack of resources the cloud part often crashes, so it's still under development.

*We didn't upload the cloud part in this github repository because it contains a lot of bugs that can damage the apps if you want to use the exact same code.

# PEOPLE WHO CONTRIBUTED TO THIS PROJECT
M7010F1021 - Firdy Sani Adhyasta (University of Indonesia)
