package com.rusty.paymentsystem.payment.adapter.`in`.web.view

import com.rusty.paymentsystem.common.WebAdapter
//import com.rusty.paymentsystem.common.IdempotencyCreator
//import com.rusty.paymentsystem.payment.adapter.`in`.web.request.CheckoutRequest
//import com.rusty.paymentsystem.payment.application.port.`in`.CheckoutCommand
//import com.rusty.paymentsystem.payment.application.port.`in`.CheckoutUseCase
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono

@WebAdapter
@Controller
class CheckoutController (
//  private val checkoutUseCase: CheckoutUseCase
)
fun checkoutPage(): Mono<String> {
    return Mono.just("checkout");
}

//{
//  @GetMapping("/")
//  fun checkoutPage(request: CheckoutRequest, model: Model): Mono<String> {
//    val checkoutCommand = CheckoutCommand(
//      cartId = request.cartId,
//      buyerId = request.buyerId,
//      productIds = request.productIds,
//      idempotencyKey = IdempotencyCreator.create(request)
//    )
//
//    return checkoutUseCase.checkout(checkoutCommand)
//      .map {
//        model.addAttribute("orderId", it.orderId)
//        model.addAttribute("orderName", it.orderName)
//        model.addAttribute("amount", it.amount)
//        "checkout"
//      }
//  }
//}