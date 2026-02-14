# DMZAddon-Example

This is a very basic example "mod"-Addon for DMZ.

[Check out DragonMine Z first!](https://www.curseforge.com/minecraft/mc-mods/dragonminez)

### How can I add my own race with their own forms?
1. Duplicate the config/dragonminez/human (or any other race) folder
2. Rename the folder to your new race's name
3. Modify the character.json file to change your race name and some other values.
4. If you want to use a custom model for that race, add their name there, just the name, without 'geo.json'.
5. Edit the stats.json if you want to, otherwise, go foward into forms!
6. Change the file name to (yourGroupformName).json
7. Open that file, and modify the groupName and formsNames

8. Create a resourcepack and place your model in the following route: assets/dragonminez/geo/entity/races/(modelName).geo.json
9. Place your model texture in the following route: assets/dragonminez/textures/entity/races/(modelName).png
10. If you want to use custom models for forms too, place them in the same routes mentioned before.

11. Start your game, load your resourcepack and select your new race!

### NOTES:
1. If you don't want a custom model, just leave that value empty (""). This will allow DMZ to use the base Human/Saiyan model instead.
2. If you just want custom forms for existant races, just duplicate the file for whatever race you want and change their values!
3. Your Custom Model needs to follow THE SAME BONE STRUCTURE as other DMZ Models, use the SaibamanRace model as example.
Otherwise, your model will not be compatible with armors, hair system and animations.
4. You can't use your own animations, we have only custom model support but not custom animations support. This may be added in a future update.
