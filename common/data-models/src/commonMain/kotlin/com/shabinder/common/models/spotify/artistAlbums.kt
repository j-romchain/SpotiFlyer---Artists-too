/*
 * Copyright (c)  2021  Shabinder Singh
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.shabinder.common.models.spotify

import kotlinx.serialization.Serializable

@Serializable
data class artistAlbums(
    var href: String? = null,
    var items: List<Album?>? = null,
    var limit: Int? = null,
    var next: String? = null,
    var previous: String? = null,
    var offset: Int? = null,
    var total: Int? = null
)
/*{
    "href": "https://api.spotify.com/v1/me/shows?offset=0&limit=20\n",
    "items": [
    {}
    ],
    "limit": 20,
    "next": "https://api.spotify.com/v1/me/shows?offset=1&limit=1",
    "offset": 0,
    "previous": "https://api.spotify.com/v1/me/shows?offset=1&limit=1",
    "total": 4
}
{
    "album_type": "compilation",
    "total_tracks": 9,
    "available_markets": [
    "CA",
    "BR",
    "IT"
    ],
    "external_urls": {
    "spotify": "string"
},
    "href": "string",
    "id": "2up3OPMp9Tb4dAKM2erWXQ",
    "images": [
    {
        "url": "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n",
        "height": 300,
        "width": 300
    }
    ],
    "name": "string",
    "release_date": "1981-12",
    "release_date_precision": "year",
    "restrictions": {
    "reason": "market"
},
    "type": "album",
    "uri": "spotify:album:2up3OPMp9Tb4dAKM2erWXQ",
    "artists": [
    {
        "external_urls": {
        "spotify": "string"
    },
        "followers": {
        "href": "string",
        "total": 0
    },
        "genres": [
        "Prog rock",
        "Grunge"
        ],
        "href": "string",
        "id": "string",
        "images": [
        {
            "url": "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n",
            "height": 300,
            "width": 300
        }
        ],
        "name": "string",
        "popularity": 0,
        "type": "artist",
        "uri": "string"
    }
    ],
    "tracks": {
    "href": "https://api.spotify.com/v1/me/shows?offset=0&limit=20\n",
    "items": [
    {}
    ],
    "limit": 20,
    "next": "https://api.spotify.com/v1/me/shows?offset=1&limit=1",
    "offset": 0,
    "previous": "https://api.spotify.com/v1/me/shows?offset=1&limit=1",
    "total": 4
}
}*/