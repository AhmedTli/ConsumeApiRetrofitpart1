package com.example.consumeapiretrofit_part1.model

import com.google.gson.annotations.SerializedName

data class Pokemon(

	@field:SerializedName("generation")
	val generation: Int? = null,

	@field:SerializedName("types")
	val types: List<TypesItem?>? = null,

	@field:SerializedName("egg_groups")
	val eggGroups: List<String?>? = null,

	@field:SerializedName("resistances")
	val resistances: List<ResistancesItem?>? = null,

	@field:SerializedName("weight")
	val weight: String? = null,

	@field:SerializedName("sexe")
	val sexe: Sexe? = null,

	@field:SerializedName("catch_rate")
	val catchRate: Int? = null,

	@field:SerializedName("evolution")
	val evolution: Evolution? = null,

	@field:SerializedName("sprites")
	val sprites: Sprites? = null,

	@field:SerializedName("formes")
	val formes: Any? = null,

	@field:SerializedName("pokedex_id")
	val pokedexId: Int? = null,

	@field:SerializedName("stats")
	val stats: Stats? = null,

	@field:SerializedName("name")
	val name: Name? = null,

	@field:SerializedName("level_100")
	val level100: Int? = null,

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("talents")
	val talents: List<TalentsItem?>? = null,

	@field:SerializedName("height")
	val height: String? = null
)

data class Name(

	@field:SerializedName("jp")
	val jp: String? = null,

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("fr")
	val fr: String? = null
)

data class Evolution(

	@field:SerializedName("next")
	val next: List<NextItem?>? = null,

	@field:SerializedName("mega")
	val mega: Any? = null,

	@field:SerializedName("pre")
	val pre: Any? = null
)

data class Sexe(

	@field:SerializedName("female")
	val female: Any? = null,

	@field:SerializedName("male")
	val male: Any? = null
)

data class NextItem(

	@field:SerializedName("pokedex_id")
	val pokedexId: Int? = null,

	@field:SerializedName("condition")
	val condition: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class Sprites(

	@field:SerializedName("shiny")
	val shiny: String? = null,

	@field:SerializedName("gmax")
	val gmax: Any? = null,

	@field:SerializedName("regular")
	val regular: String? = null
)

data class ResistancesItem(

	@field:SerializedName("multiplier")
	val multiplier: Double? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class TypesItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class Stats(

	@field:SerializedName("vit")
	val vit: Int? = null,

	@field:SerializedName("def")
	val def: Int? = null,

	@field:SerializedName("spe_atk")
	val speAtk: Int? = null,

	@field:SerializedName("hp")
	val hp: Int? = null,

	@field:SerializedName("atk")
	val atk: Int? = null,

	@field:SerializedName("spe_def")
	val speDef: Int? = null
)

data class TalentsItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("tc")
	val tc: Boolean? = null
)
