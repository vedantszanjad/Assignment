export class Item
{
    itemId!: number;
    itemName!:string;
    price!:number;

    constructor(itemId: number,itemName:string,price:number)
    {
        this.itemId=itemId;
        this.itemName=itemName;
        this.price=price;
    }
}
