package com.example.androidprojectzamt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidprojectzamt.Screen.OpderPaid
import com.example.androidprojectzamt.Screen.PlacingAnOrder
import com.example.androidprojectzamt.ui.theme.Pr7theme
import com.example.pr5.Screen.SignUp
import kotlinx.serialization.Serializable

@Serializable
object SignUpScreen

@Serializable
object PlacingAnOrderScreen

@Serializable
object OrderPaidScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pr7theme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = SignUpScreen
                ) {
                    composable<SignUpScreen> {
                        SignUp(navController = navController)
                    }

                    composable<PlacingAnOrderScreen> {
                        PlacingAnOrder(
                            navController = navController,
                            maintext = "Оформление заказа",
                            text1 = "Адрес *",
                            textfieldtext1 = "Введите ваш адрес",
                            text2 = "Телефон *",
                            textfeildtext2 = "Введите ваш номер телефона",
                            text3 = "Комментарий",
                            textfieldtext3 = "Можете оставить свои пожелания",
                            text4 = "Промокод",
                            text5 = "1 анализ",
                            text6 = "690 ₽",
                            buttontext = "Заказать",
                            icoback = R.drawable.back,
                            iconext = R.drawable.next,
                            icovoice = R.drawable.voice
                        )
                    }

                    composable<OrderPaidScreen> {
                        OpderPaid(
                            navController = navController,
                            maintext = "Оплата",
                            text1 = "Ваш заказ успешно оплачен!",
                            text2 = "Вам осталось дождаться приезда медсестры и сдать анализы. \nДо скорой встречи!",
                            outlinedbuttext = "Чек покупки",
                            buttext = "На главную",
                            ico = R.drawable.kolba
                        )
                    }
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier,
//        style = MyTheme.typography.headingblack96,
//        color = MyTheme.colors.primary
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Pr7theme {
//        Greeting("Android")
//    }
//}

@Preview
@Composable
private fun SignUpPrev() {
    val navController = rememberNavController()
    SignUp(navController = navController)
}