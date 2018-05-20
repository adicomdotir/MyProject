import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  allowNewServer: boolean = false;
    serverCreationStatus: string = "سروری ایجاد نشده است";
    serverName: string = '';
    serverCreation: boolean = false;
    servers: string[] = ["سرور روکسو", "سرور اختصاصی روکسو"];
 
    constructor() {
        setTimeout(() => {
            this.allowNewServer = true;
        }, 2000);
    }
 
    ngOnInit() {
    }
 
    onCreateServer() {
        this.serverCreation = true;
        this.servers.push(this.serverName);
        this.serverCreationStatus = 'سرور جدید با موفقیت ایجاد شد و نام این سرور برابر است با: ' + this.serverName;
    }
 
    onUpdateServerName(event: Event) {
        this.serverName = (<HTMLInputElement>event.target).value;
    }

}
