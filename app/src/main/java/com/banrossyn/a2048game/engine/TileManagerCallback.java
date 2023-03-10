package com.banrossyn.a2048game.engine;

import android.graphics.Bitmap;

import com.banrossyn.a2048game.engine.sprites.Tile;

public interface TileManagerCallback {
    Bitmap getBitmap(int count);
    void finishedMoving(Tile t);
    void updateScore(int delta);
    void reached2048();
}
