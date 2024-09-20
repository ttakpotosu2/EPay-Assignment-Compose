package com.example.epayasscompose

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val services = listOf(
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
		category = "Airtime-Top"
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity",
		category = "Utilities"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv",
		category = "Streaming"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
		category = "Streaming"
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo",
		category = "Airtime-Top"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone",
		category = "Airtime-Top"
	),
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
		category = "Airtime-Top"
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity",
		category = "Utilities"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv",
		category = "Streaming"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
		category = "Streaming"
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo",
		category = "Airtime-Top"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone",
		category = "Airtime-Top"
	),
	Services(
		title = "MTN",
		icon = R.drawable.mtn,
		category = "Airtime-Top"
	),
	Services(
		icon = R.drawable.ecg,
		title = "Electricity",
		category = "Utilities"
	),
	Services(
		icon = R.drawable.dstv,
		title = "DStv",
		category = "Streaming"
	),
	Services(
		title = "GOtv",
		icon = R.drawable.gotv,
		category = "Streaming"
	),
	Services(
		icon = R.drawable.at_logo,
		title = "Airtel Tigo",
		category = "Airtime-Top"
	),
	Services(
		icon = R.drawable.voda,
		title = "Vodafone",
		category = "Airtime-Top"
	)
)

val categories = listOf(
	Categories(
		title = "All"
	),
	Categories(
		icon = R.drawable.group_2928,
		title = "Airtime-Top"
	),
	Categories(
		icon = R.drawable.internet,
		title = "Streaming"
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
	val title: String,
	val category: String
)

object Dimensions {
	val small: Dp = 6.dp
	val medium: Dp = 12.dp
	val semiMedium: Dp = 16.dp
	val large: Dp = 20.dp
	val extraLarge: Dp = 50.dp
}


