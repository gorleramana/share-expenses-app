import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RgHomeComponent } from './components/rg-home/rg-home.component';
import { RgRegisterComponent } from './components/rg-register/rg-register.component';
import { RgForgotPwdComponent } from './components/rg-forgot-pwd/rg-forgot-pwd.component';
import { RgLoginComponent } from './components/rg-login/rg-login.component';
import { MatDialogModule } from '@angular/material/dialog';

@NgModule({
  declarations: [
    AppComponent,
    RgHomeComponent,
    RgRegisterComponent,
    RgForgotPwdComponent,
    RgLoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    MatDialogModule
  ],
  providers: [
    provideClientHydration(),
    provideHttpClient(withFetch())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
