package HA;

import HA.content.*;
import arc.*;
import arc.util.*;
import mindustry.Vars;
import mindustry.game.EventType.*;
import mindustry.mod.*;

import static arc.Core.app;

public class Omaloon extends Mod{
    public static Mods.LoadedMod modInfo;

    public static String fullName(String name) {
        if (modInfo == null) throw new IllegalArgumentException("modInfo cannot be null");
        return Strings.format("@-@", modInfo.name, name);
    }

    public Omaloon(){
        Events.on(FileTreeInitEvent.class, e -> app.post(HASounds::load));
        Log.info("Loaded Aelios constructor.");
        Vars.mods.getMod(getClass());
    }
    @Override
    public void loadContent(){
        Log.info("Loading some content.");
        HAItems.load();
        HALiquids.load();
        HAPlanets.load();
        HABlocks.load();
        HASounds.load();

    }

}
