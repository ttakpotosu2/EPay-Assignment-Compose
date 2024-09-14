package com.example.epayasscompose

val services = listOf(
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone"
	),
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone"
	),
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone"
	),
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone"
	),
)

val categories = listOf(
	Categories(
		title = "All"
	),
	Categories(
		icon = R.drawable.group_2928,
		title = "Airtime Top"
	),
	Categories(
		icon = R.drawable.internet,
		title = "Internet"
	),
	Categories(
		icon = R.drawable.sent_money,
		title = "Send Money"
	),
	Categories(
		icon = R.drawable.utilites,
		title = "Utilities"
	),
)

data class Categories (
	val icon: Int? = null,
	val title: String
)

data class Services (
	val icon: Int,
	val title: String
)