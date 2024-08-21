# Who Is Sleeping

## Overview

**Who Is Sleeping** is a Minecraft mod that notifies players when the game transitions from night to day due to a player sleeping. It enhances multiplayer gameplay by broadcasting which player caused the transition.

## Features

- Broadcasts a message when transitioning from night to day due to a player sleeping.
- Works only in worlds with a day/night cycle.

## Installation

1. **Download the Mod:**
   - Download the latest release from the [releases page](#).

2. **Install Fabric:**
   - Ensure Fabric is installed. You can download it from the [official website](https://modrinth.com/mod/who-is-sleeping/).

3. **Place the Mod:**
   - Place the downloaded mod JAR file into the `mods` folder of your Minecraft installation.

4. **Run Minecraft:**
   - Launch Minecraft with the Fabric profile.

## Usage

- The mod automatically detects when the game transitions from night to day and broadcasts a message indicating which player caused it by sleeping.

## Configuration

- No additional configuration is required. The mod functions out of the box.

## Changelog

### [1.0.0] - 2024-08-21
- Initial release with functionality to notify players when the day begins due to a player sleeping.

## Troubleshooting

- **Issue:** Mod not working.
  - **Solution:** Ensure the mod is in the `mods` folder and Fabric API is installed.

- **Issue:** Notifications are not appearing.
  - **Solution:** Check that the game rules permit the day/night cycle and verify there are no conflicting mods.

## Building the Project

To build the mod using Gradle, follow these steps:

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/whoissleeping.git
   cd whoissleeping
   gradlew build

