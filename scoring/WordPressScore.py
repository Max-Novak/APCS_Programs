import os.path

#Media file on the site
mediaFile = os.path.isfile("C:/xampp/htdocs/TEST123/wordpress/wp-content/uploads/2017/09/download.png")
if mediaFile:
    print("Incorrect! Keep going!")
else:
    print("Correct! Here is your code:   I am a mushroom!354")
    
#Plugin removed
mediaFile = os.path.isdir("C:/xampp/htdocs/TEST123/wordpress/wp-content/plugins")
if mediaFile:
    print("Incorrect! Keep going!")
else:
    print("Correct! Here is your code:   I like banana...464")
