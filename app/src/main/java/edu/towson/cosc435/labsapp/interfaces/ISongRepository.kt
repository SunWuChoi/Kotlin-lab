package edu.towson.cosc435.labsapp.interfaces

import edu.towson.cosc435.labsapp.models.Song

// The song repository is an abstract collection of Songs
// We will need methods for:
// getting the number of songs, getting a song by index,
// getting all the songs in the repository, deleting a song,
// and, finally, replacing a song at a given index (this one will be explained later)

interface ISongRepository {
    fun getCount(): Int
    fun getSong(idx: Int): Song
    suspend fun getAll(): List<Song>
    suspend fun remove(song: Song)
    suspend fun replace(idx: Int, song: Song)
    suspend fun addSong(song: Song)
}