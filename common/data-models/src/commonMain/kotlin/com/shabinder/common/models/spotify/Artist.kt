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
data class Artist(
    var external_urls: Map<String?, String?>? = null,
    var href: String? = null,
    var id: String? = null,
    var name: String? = null,
    var type: String? = null,
    var uri: String? = null,
    var images: List<Image?>? = null
)
